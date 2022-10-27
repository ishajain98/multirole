@Entity
@Table(name = "cms_users")
public class User implements Serializable {

    @Id
      @Column(name = "user_id")
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int id;

@Column(name = "firstname")
    private String firstName;

    

	@ManyToMany(cascade = CascadeType.ALL, fetch = FetchType.EAGER)
	@JoinTable(
			name = "cms_user_privilege",
			joinColumns = @JoinColumn(name = "user_id", referencedColumnName = "user_id"),
			inverseJoinColumns = @JoinColumn(name = "privilege_id", referencedColumnName = "privilege_id")
	)
	private Set<CMSRoles> roles = new HashSet<>();

	public Set<CMSRoles> getRoles(){ return roles; }
	public void setRoles(CMSRoles role){
		this.roles.add(role);
		return;
	}
	 public int getId() {
        return id;
    }
	public void setId(int id) {
        this.id = id;
    }
	}

