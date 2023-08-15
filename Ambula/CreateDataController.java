
@RestController
public class CreateDataController {

    @Autowired
    private UserRepository userRepository;

    @PostMapping("/create_data")
    public void createData() {
        User user = new User();
        user.setName("John Doe");
        user.setLatitude(0.0);
        user.setLongitude(0.0);
        user.setExcluded(false);
        userRepository.save(user);
    }

}
