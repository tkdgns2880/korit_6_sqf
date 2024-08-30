function modifyUser(user, target, value) {
    const newUser = {
        ...user,
        [target] : value
    }; /* []를 사용하면 target가 username이 된다
           []를 사용하지 않으면 target(키값)이 타겟이 된다  */
    return newUser;
}
function main() {
    const user = {
        username : "admin",
        password : "1234"
    }
    // delete user.password; 지울때 사용
    
    console.log(user);

    const newUser = modifyUser(user, "username", "test-user");
    console.log(newUser);

    const newUser2 = modifyUser(newUser, "password", "1111");
    console.log(newUser2);

    // 스프레드 -> 깊은 복사(새로운 주소안에 값을 그대로 복사)
    const userList = [ user, newUser ]; // 100
    const newUserList = [ ...userList, newUser2 ]; // 200
    
    // 얕은 복사 (주소만 복사)
    const userList2 = userList;

    const [ a, b, c ] = newUserList;
    const { username, password } = a; // const { username, password } = nawUserList[0]; 같음
}
main();