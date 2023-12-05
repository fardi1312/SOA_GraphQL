package graphql;

import java.awt.*;
import java.util.List;

import com.coxautodev.graphql.tools.GraphQLRootResolver;

import entity.Logement;
import entity.RendezVous;
import repository.LogementRepository;
import repository.RendezVousRepository;

public class Query implements GraphQLRootResolver {
private RendezVousRepository rendezVousRepository;
private  LogementRepository logementRepository;

    public Query (RendezVousRepository repoR , LogementRepository repoLo){
        this.rendezVousRepository= repoR;
        this.logementRepository=repoLo;
    }

    public  List<RendezVous> getallrendezVous(){
        return this.rendezVousRepository.getListeRendezVous();
    }

}
