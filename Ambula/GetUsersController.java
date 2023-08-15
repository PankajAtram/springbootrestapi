
@RestController
public class GetUsersController {

    @Autowired
    private UserRepository userRepository;

    @GetMapping("/get_users/{n}")
    public List<User> getUsers(@PathVariable int n) {
        List<User> users = userRepository.findByExcludedFalseAndDistanceLessThan(0.0, n);
        users.sort(Comparator.comparingDouble(User::getDistance));
        return users;
    }

}
