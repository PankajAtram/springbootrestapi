

@RestController
public class UpdateDataController {

    @Autowired
    private UserRepository userRepository;

    @PutMapping("/update_data")
    public void updateData(@RequestBody User user) {
        userRepository.save(user);
    }

}
