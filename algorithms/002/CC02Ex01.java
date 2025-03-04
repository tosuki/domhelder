import java.util.HashMap;

record EntityLocation (int id, String placeName) {}

class Entity {
    public final String name;
    public EntityLocation location;

    public Entity(String name) {
        this.name = name;
    }

    private void traceMovement(EntityLocation from, EntityLocation to) {
        if (from == null) {
            System.out.println(this.name + " walking to the " + to.placeName());
        } else {
            System.out.println(this.name + " walking from " + from.placeName() + " to " + to.placeName());
        }
    }

    public void setLocation(EntityLocation location) {
        traceMovement(this.location, location);
        this.location = location;
    }
}

class Place {
    public final int id;
    public final String name;
    public final HashMap<String, Place> subPlaces = new HashMap<String, Place>();

    public Place(int id, String name) {
        this.id = id;
        this.name = name;
    }

    public void goTo(String place, Entity entity) {
        Place subPlace = this.subPlaces.get(place.toLowerCase());

        if (subPlace == null) {
            System.out.println(place + " doesn't exist in our database");
            return;
        }

        entity.setLocation(new EntityLocation(subPlace.id, subPlace.name));
    }

    public void addPlace(String name) {
        int size = this.subPlaces.size();

        if (this.subPlaces.containsKey(name.toLowerCase())) {
            System.out.println(this.name + " already contains the sub place called " + name);
            return;
        }

        this.subPlaces.put(name.toLowerCase(), new Place(size, name.toLowerCase()));
        System.out.println("Added " + name.toLowerCase() + " as a sub place of " + this.name);
    }
}

class DomHelderUniversity extends Place {
    public DomHelderUniversity(int id) {
        super(id, "Dom Helder");

        this.addPlace("Laboratory");
    }
}

public class CC02Ex01 {
    public static void main(String[] args) {
        Place university = new DomHelderUniversity(0);
        Entity robot = new Entity("Robot A1");

        university.goTo("Laboratory", robot);
    }
}