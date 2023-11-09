package org.chdtu;

public class PersonDetails {
    private Person person;
    private String additionalInfo;
    private String someOtherProperty;

    public void setPerson(Person person) {
        this.person = person;
    }

    public void setAdditionalInfo(String additionalInfo) {
        this.additionalInfo = additionalInfo;
    }

    public void setSomeOtherProperty(String someOtherProperty) {
        this.someOtherProperty = someOtherProperty;
    }

    // Other properties or methods...

    @Override
    public String toString() {
        return "PersonDetails{" +
                "person=" + person +
                ", additionalInfo='" + additionalInfo + '\'' +
                ", someOtherProperty='" + someOtherProperty + '\'' +
                '}';
    }
}
