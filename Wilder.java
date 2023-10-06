public class Wilder {

    private String firstname;
    private boolean aware;

    public Wilder(String firstname, boolean aware) {
        this.firstname = firstname;
        this.aware = aware;
    }

    public String getFirstname() {
        return firstname;
    }

    public void setFirstname(String firstname) {
        this.firstname = firstname;
    }

    public boolean isAware() {
        return aware;
    }

    public void setAware(boolean aware) {
        this.aware = aware;
    }

    public String whoAmI(Wilder wilder) {
        if (wilder.isAware()) {
            return "Je suis " + wilder.getFirstname() + " et je suis aware";
        } else {
            return "Je suis " + wilder.getFirstname() + " et je ne suis pas aware";
        }

    };
}
