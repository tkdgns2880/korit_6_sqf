/** @jsxImportSource @emotion/react */
import { Link, Route, Routes, useLocation, useNavigate } from "react-router-dom";
import MainContainer from "../../components/MainContainer/MainContainer";


function RouteStudySubPage() {
    const navigate = useNavigate();
    const location = useLocation();

    console.log(location.pathname);
    // location.pathname 주소의 이름을 가져올수 있다
    console.log(location.pathname.lastIndexOf("/"));
    // lastIndexOf("/") 인덱스를 찾을 있다
    const index = location.pathname.lastIndexOf("/");
    console.log(location.pathname.substring(index + 1));
    // substring(index) 인덱스의 값만 찾을수 있다

    const handleAgeClick = () => {
        navigate("/routestudy/page1/age", {replace : true});
        // window.location.href = "https://naver.com" => replace : false;
        // replace : false 이면 뒤로 가기 했을때 기록을 남기지 않는다
        // window.location.replace("https://naver.com") => replace : true;
        // replace : true 이면 뒤로 가기 했을시 기록을 남긴다
    }
    return (
            <div>
            <ul>
                <Link to={"/routestudy/page1/name"}><li>이름</li></Link>
                <Link to={"/routestudy/page1/age"}><li>나이</li></Link>
                <Link to={"/routestudy/page1/address"}><li>주소</li></Link>
            </ul>
            <button onClick={handleAgeClick}>나이</button>
            <div>
                <Routes>
                    <Route path="/name" element={<h1>정상훈</h1>} />
                    <Route path="/age" element={<h1>30</h1>} />
                    <Route path="/address" element={<h1>남구</h1>} />
                </Routes>
            </div>
            </div>
    );
}
export default RouteStudySubPage;

// window.location.href = "naver.com" // 페이지 전체 렌더링 다시해야 할 경우 사용