package hu.nive.ujratervezes.zarovizsga.cleaning;

import java.util.ArrayList;
import java.util.List;

public class CleaningService {
    List<Cleanable> cleanables = new ArrayList<>();

    public void add(Cleanable cleanable) {
        cleanables.add(cleanable);
    }

    public int cleanAll() {
        List<Cleanable> all = new ArrayList<>(cleanables);
        cleanables.clear();
        return all.stream().mapToInt(Cleanable::clean).sum();
    }

    public int cleanOnlyOffices() {
        List<Cleanable> offices = cleanables.stream().filter(c -> c instanceof Office).toList();
        cleanables.removeAll(offices);
        return offices.stream().mapToInt(Cleanable::clean).sum();
    }

    public List<Cleanable> findByAddressPart(String address) {
        return cleanables.stream().filter(c -> c.getAddress().contains(address)).toList();
    }

    public String getAddresses() {
        if (cleanables.isEmpty()) {
            return "";
        } else {
            return cleanables.stream().map(Cleanable::getAddress).reduce("", (partialElement, element) -> partialElement + ", " + element).substring(2);
        }
    }

    public List<Cleanable> getCleanables() {
        return cleanables;
    }
}
