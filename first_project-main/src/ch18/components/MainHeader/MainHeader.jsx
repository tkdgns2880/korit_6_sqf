/** @jsxImportSource @emotion/react */
import { useRecoilState } from "recoil";
import * as s from "./style";
import { FaBars } from "react-icons/fa";
import { mainSidebarShowAtom } from "../../atoms/mainSidebarShowAtom";
import MainContainer from "../MainContainer/MainContainer";

function MainHeader() {
    const [ mainSidebarShow, setMainSidebarShow ] = useRecoilState(mainSidebarShowAtom);

    const handleMainMenuToggleClick = () => {
        setMainSidebarShow(true); // 열림 버튼이라 무조건 true 로 적용해줘야 한다
    }

    return (
        <div css={s.layout}>
            <MainContainer>
                <div css={s.headerBody}>
                <button 
                css={s.menuToggleButton} 
                onClick={handleMainMenuToggleClick}>
                    <FaBars /></button> {/* 아이콘을 끌어다 쓸때는 대문자로 시작해서 태그를 한다*/}
                </div>
            </MainContainer>
        </div>
    );
}
export default MainHeader;

// import { 아이콘이름 } from "react-icons/fa"; -> 아이콘을 끌어다 쓰는 인폴트