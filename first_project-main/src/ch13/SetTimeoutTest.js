function SetTimeoutTest() {
    /**
     * 비동기
     */

    // setTimeout -> 첫번째로 함수가 들어가고 두번째로 시간의 초단위가 들어간다
    setTimeout(() => { // () => {} 콜백함수
        print(count);
    }, 2000);

    function print(fx) {
        console.log(4);
        fx();
    }

    function count() {
        console.log(1);
        console.log(2);
        console.log(3);
    }
    
    /**
     * 콜백함수
     */
    function test(fx) {
        console.log("test 함수 호출");
        fx();        
    }
    function add() {
        console.log("add 함수 호출");
    }
    test(add);
    
    return (
        <>
        </>
    );
}
export default SetTimeoutTes