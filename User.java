@Entity
@Table(name = "cms_users")
public class User implements Serializable {

    @Id
      @Column(name = "user_id")
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

@Column(name = "firstname")
    private String firstName;

    @Column(name = "lastname")
    private String lastName;




	@ManyToMany(cascade = CascadeType.ALL, fetch = FetchType.EAGER)
	@JoinTable(
			name = "cms_user_role",
			joinColumns = @JoinColumn(name = "agent_olm_id", referencedColumnName = "agent_olm_id"),
			inverseJoinColumns = @JoinColumn(name = "role_id", referencedColumnName = "role_id")
	)
	private Set<CMSRoles> roles = new HashSet<>();

	public Set<CMSRoles> getRoles(){ return roles; }
	public void setRoles(CMSRoles role){
		this.roles.add(role);
		return;
	}
	}// getter setter to add

