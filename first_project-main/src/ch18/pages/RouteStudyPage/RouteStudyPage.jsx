/** @jsxImportSource @emotion/react */
import { Link, Route, Routes } from "react-router-dom";
import MainContainer from "../../components/MainContainer/MainContainer";
import RouteStudySubPage from "../RouteStudySubPage1/RouteStudySubPage";

function RouteStudyPage() {
    return (
        <MainContainer>
            <div>
            <h1>라우트 수업</h1>
            <ul>
                <Link to={"/routestudy/page1"}><li>1번페이지</li></Link>
                <Link to={"/routestudy/page2"}><li>2번페이지</li></Link>
                <Link to={"/routestudy/page3"}><li>3번페이지</li></Link>
            </ul>
            <div>
                <Routes>
                    <Route path="/page1/*" element={<RouteStudySubPage />} />
                    <Route path="/page2" element={<div>페이지2</div>} />
                    <Route path="/page3" element={<div>페이지3</div>} />
                </Routes>
            </div>
            </div>
        </MainContainer>
    );
}
export default RouteStudyPage;

// Link 부분 렌더링을 쓰기위해서 

