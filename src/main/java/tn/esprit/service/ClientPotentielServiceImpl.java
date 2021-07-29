package tn.esprit.service;

import java.util.List;

import javax.transaction.Transactional;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import tn.esprit.entity.ClientMorale;
import tn.esprit.entity.ClientPhysique;
import tn.esprit.entity.ClientPotentiel;
import tn.esprit.entity.EtatDemande;
import tn.esprit.entity.TypeClient;
import tn.esprit.repository.ClientMoraleRepository;
import tn.esprit.repository.ClientPhysiqueRepository;
import tn.esprit.repository.ClientPotentielRepository;
import tn.esprit.repository.ClientRepository;
import tn.esprit.tools.Email;
import tn.esprit.tools.SMS;

@Service
public class ClientPotentielServiceImpl implements ClientPotentielService {

	private static final Logger L = LogManager.getLogger(ClientPotentielServiceImpl.class);

	@Autowired
	ClientPotentielRepository clientpotentielRep;

	@Autowired
	ClientRepository clientRep;

	@Autowired
	ClientPhysiqueRepository clientPhysiqueRep;

	@Autowired
	ClientMoraleRepository clientMoraleRep;

	public ClientPotentielRepository getClientpotentielRep() {
		return clientpotentielRep;
	}

	public void setClientpotentielRep(ClientPotentielRepository clientpotentielRep) {
		this.clientpotentielRep = clientpotentielRep;
	}

	@Override
	public List<ClientPotentiel> retrieveAllClientsPt() {

		return clientpotentielRep.findAll();
	}

	@Override
	public ClientPotentiel addClientPt(ClientPotentiel c) {

		return clientpotentielRep.save(c);
	}

	@Override
	public void deleteClientPtById(Integer id) {
		clientpotentielRep.deleteById(id);

	}

	@Override
	public ClientPotentiel updateClientPt(ClientPotentiel c) {

		return clientpotentielRep.save(c);
	}

	@Override
	public ClientPotentiel retrieveClientPtById(Integer id) {

		return clientpotentielRep.findById(id).get();
	}

	@Override
	@Transactional
	public boolean confirmerDemande(int idDemande) {
		ClientPotentiel cp = clientpotentielRep.findById(idDemande).orElse(null);
		cp.setEtat(EtatDemande.ACCEPTEE);
		clientpotentielRep.save(cp);
		if (cp.getTypeClient().equals(TypeClient.PHYSIQUE)) {
			ClientPhysique c = new ClientPhysique(cp.getTelephone(), cp.getFax(), cp.getAdresseEmail(), cp.getAdresse(),
					cp.getCin(), cp.getNumPasseport(), cp.getNom(), cp.getPrenom(), cp.getDateNaissance(),
					cp.getGenre(), cp.getEtatCivil(), cp.getProfession());
			clientPhysiqueRep.save(c);
			String adressEmail = cp.getAdresseEmail();

			Email email = new Email(adressEmail);
			email.AccepterDemandeAdheration();
			email.envoyerEmail();

			/*************************************************************************************************************/
			
			//String content = "Cher client,\nVotre demande d'etre un client chez notre banque a été acceptée. Veuilliez passer, le plutot possible à votre agence pour avoir recupérer votre compte.\nje vous souhaite une excellente journée.\nCordialement.";
			//SMS sms = new SMS("+216" +99860646 , content);
			//sms.sendSMS();

			return true;
		} else {
			ClientMorale cm = new ClientMorale(cp.getTelephone(), cp.getFax(), cp.getAdresseEmail(), cp.getAdresse(),
					cp.getMatriculeFiscal(), cp.getLibelle(), cp.getRaisonSociale(), cp.getCategorie());
			clientMoraleRep.save(cm);
			String adressEmail = cp.getAdresseEmail();

			Email email = new Email(adressEmail);
			email.AccepterDemandeAdheration();
			email.envoyerEmail();
			
			/******************************************************************************************************/
			
			//String content = "Cher client,\nVotre demande d'etre un client chez notre banque a été acceptée. Veuilliez passer, le plutot possible à votre agence pour avoir recupérer votre compte.\nje vous souhaite une excellente journée.\nCordialement.";
			//SMS sms = new SMS("+216" + 99860646, content);
			//sms.sendSMS();
			
			return true;
		}
	}

	public static Logger getL() {
		return L;
	}

}
