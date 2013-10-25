package anaydis.analisys;

/**
 * Created with IntelliJ IDEA.
 * Author: Tomás Vilaboa
 * Project: AnayDis-2013
 * Date: 26/08/13
 * Time: 20:16
 */
class FullName {
       private String firsname;
    private String lastname;

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("FullName{");
        sb.append("firsname='").append(firsname).append('\'');
        sb.append(", lastname='").append(lastname).append('\'');
        sb.append('}');
        return sb.toString();
    }

    public FullName(String firsname, String lastname) {
        this.firsname = firsname;
        this.lastname = lastname;
    }

    public String getFirsname() {
        return firsname;
    }

    public String getLastname() {
        return lastname;
    }
}