package by.sadovnick.planefinderjpa.loader;

import by.sadovnick.planefinderjpa.entity.Aircraft;
import by.sadovnick.planefinderjpa.repository.AircraftRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;
import java.time.Instant;

@Component
public class DataLoader {
    private final AircraftRepository repository;

    @Autowired
    public DataLoader(AircraftRepository repository) {
        this.repository = repository;
    }

    @PostConstruct
    private void loadData(){
        repository.deleteAll();
        repository.save(new Aircraft(81L,
                "AAL608", "1451", "N754UW", "AA608", "IND-PHX", "A319", "A3",
                36000, 255, 423, 0, 36000,
                39.150284, -90.684795, 1012.8, 26.575562, 295.501994,
                true, false,
                Instant.parse("2020-11-27T21:29:35Z"),
                Instant.parse("2020-11-27T21:29:34Z"),
                Instant.parse("2020-11-27T21:29:27Z")));
    }
}
