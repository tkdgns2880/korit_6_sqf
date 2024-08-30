const user = { /* class User {} 같은 표현 */
    username : "admin",
    password : "1234",
    name : {
        lastName : "정",
        firstName : "상훈"
    },
    print : () => {
        console.log("사용자이름: " + user.username);
        console.log(`비밀번호: ${user.password}`);
    },
};
console.log(user);
console.log(user.username);
console.log(user.password);
console.log(user.name.lastName);
console.log(user.name.firstName);
user.print(); 