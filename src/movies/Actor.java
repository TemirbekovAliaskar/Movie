package movies;

public class Actor {
    private int id;
    private String fullName;
    private String role;

    public Actor(int id, String fullName, String role) {
        this.id = id;
        this.fullName = fullName;
        this.role = role;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getFullName() {
        return fullName;
    }

    public void setFullName(String fullName) {
        this.fullName = fullName;
    }

    public String getRole() {
        return role;
    }

    public void setRole(String role) {
        this.role = role;
    }

    @Override
    public String toString() {
        return "         Actor    " +
                "🛑 id -->> " + id +
                " fullName -->> " + fullName + '\'' +
                " role -->> " + role + '\'' +
                ';';
    }
}
