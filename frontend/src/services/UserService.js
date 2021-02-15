import axios from 'axios';

const USERS_REST_API_URL = 'http://localhost:8090/api/users';

class UserService {
    getUsers(){
        return axios.get(USERS_REST_API_URL);
    }
}

export default new UserService();

