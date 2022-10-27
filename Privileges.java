

@Entity
@Table(name = "privileges")
public class Privileges implements Serializable {

    @Id
    @Column(name = "privilege_id")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    @Column(name ="privilege_name")
    private String name;

    @ManyToMany(mappedBy = "privileges")
    private Collection<CMSRoles> roles;

    public int getprivilegeId() {
            return id;
        }

        public void setprivilegeId(int Id) {
            this.id = id;
        }

        public String getname() {
            return name;
        }

        public void setname(String name) {
            this.name = name;
        }
}
