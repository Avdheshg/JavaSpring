package fundamentals.practice.basic.beans;

public class Car
{
    private Specification specification;
    private Owner owner;

    public Car(Specification specification, Owner owner) {
        this.specification = specification;
        this.owner = owner;
    }

    @Override
    public String toString()
    {
        return "Car Details: " +
                "Specification: " + this.specification.toString() +
                "Owner: " + this.owner.toString();
    }

}
