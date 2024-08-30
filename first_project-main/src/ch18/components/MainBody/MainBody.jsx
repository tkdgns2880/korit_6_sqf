/** @jsxImportSource @emotion/react */
import { Route, Routes } from "react-router-dom";
import RouteStudyPage from "../../pages/RouteStudyPage/RouteStudyPage";
import * as s from "./style";
import HomePage from "../../pages/Homepage/Homepage";
import SearchParamsStudy from "../../pages/SearchParamsStudy/SearchParamsStudy";
import CustomHookPage from "../../pages/CustomHookPage/CustomHookPage";
import MemoizationPage from "../../pages/MemoizationPage/MemoizationPage";
import ParamsStudyPage from "../../pages/ParamsStudyPage/ParamsStudyPage";
// {} 중괄호가 없는애들은 default(디폴트)이다 
// default(디폴트)는 이름을 마음대로 지정해 줄수 있다

function MainBody() {
    return (
        <div css={s.layout}>
            <Routes>
                <Route path="" element={<HomePage />} />
                <Route path="/routestudy/*" element={<RouteStudyPage />} />
                <Route path="/params/:name/*" element={<ParamsStudyPage />} />
                <Route path="/SearchParams" element={<SearchParamsStudy />} />
                <Route path="/customHook/:id" element={<CustomHookPage />} />
                <Route path="/memoization" element={<MemoizationPage />} />
            </Routes>
        </div>
    );
}
export default MainBody;

// <Route path="/routestudy/*" element={<RouteStudyPage />}/> -> 서버라우터
// /* -> 라우터 안에 또 다른 라우터를 넣은것