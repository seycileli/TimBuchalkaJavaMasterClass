package entities;

import java.util.HashSet;
import java.util.Set;

public final class HeavenlyBody {
    private final String name;
    private final double orbitalPeriod;
    private final Set<HeavenlyBody> satellites;

    public HeavenlyBody(String name, double orbitalPeriod) {
        this.name = name;
        this.orbitalPeriod = orbitalPeriod;
        this.satellites = new HashSet<>();
    }

    public String getName() {
        return name;
    }

    public double getOrbitalPeriod() {
        return orbitalPeriod;
    }

    public boolean addMoon(HeavenlyBody moon) {
        return this.satellites.add(moon);
    }

    public Set<HeavenlyBody> getSatellites() {
        return new HashSet<>(this.satellites);
    }

    /*
    * Will check to see if it compares to it self
    * if so, will return true
    *
    * next, does a similar test, but in order subclass dont compare equal
    * check actual class of object being compared of object the method is in
    * if check if object is compared to null you'll get a nullPointerException
    * that is why test for null first,
    * */
    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }

        System.out.println("obj.getClass() is " + obj.getClass());
        System.out.println("this.getClass() is " + this.getClass());
        if (obj == null || obj.getClass() != this.getClass()) {
            return false;
        }

        String objName = ((HeavenlyBody) obj).getName();
        return this.name.equals(objName);
    }

    @Override
    public int hashCode() {
        System.out.println("hashCode(); called");
        return this.name.hashCode() + 57;
    }

    /*
    * When @Overriding the equals() method in the HeavenlyBody class,
    * We were careful make sure that it would not return true if HeavenlyBody
    * we compared to a subclass of itself
    *
    * We did that to demonstrate the method, but in actuality it was unnecessary
    * in the HeavenlyBody Class
    *
    * The mini challenge is just a question. Why was it unnecessary?
    *
    * Hint: if you are stuck, you can return back to lecture 97
    *
    * Answer:
    * The HeavenlyBody Class was declared final, so therefore it cannot be subclassed
    * The Java String Class is also final, which is why it can safely
    * use the instanceof method without having to worry about
    * comparisons of a subclass*/

}
