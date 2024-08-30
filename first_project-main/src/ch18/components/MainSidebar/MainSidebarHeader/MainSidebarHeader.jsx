/** @jsxImportSource @emotion/react */
import { FaBars, FaBook } from "react-icons/fa";
import * as s from "./style";
import { useRecoilState } from "recoil";
import { mainSidebarShowAtom } from "../../../atoms/mainSidebarShowAtom";
import MainContainer from "../../MainContainer/MainContainer";

function MainSidebarHeader() {
    const [ mainSidebarShow, setMainSidebarShow ] = useRecoilState(mainSidebarShowAtom);

    const handleMainMenuToggleClick = () => {
        setMainSidebarShow(false); // 닫는버튼 false를 줘야 닫을수 있다
    }
    return (
        <div css={s.layout}>
            <MainContainer>
                <div css={s.header}>
                    <h1 css={s.title}>
                        <FaBook />
                        <span>수업자료</span>
                    </h1>
                    <button 
                    css={s.menuToggleButton} 
                    onClick={handleMainMenuToggleClick}>
                    <FaBars /></button>
                </div>
            </MainContainer>
        </div>
    );
}
export default MainSidebarHeader;