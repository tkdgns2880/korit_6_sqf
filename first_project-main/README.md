## 프로젝트 생성
- npx create-react-app 프로젝트명

## 라이브러리 설치
- 라우터 > npm i react-router-dom
- Emotion > npm i @emotion/react
- Recoil > npm i recoil
- React Icons > npm i react-icons
- Sweetalert2 > npm i sweetalert2

## JSX 자동완성
- Ctrl + Shift + p
- user settings.json(vscode 사용자 설정) 선택
- 아래 설정 추가
```json
"emmet.syntaxProfiles" : {
    "jacascript" : "jsx"
}
"emmet.includeLanguages" : {
    "jacascript" : "html"
}
```

## 확장기능(Extension)
- reactjs code snippets
- 색깔 선택기능 추가 파일 > vscode-color-picker
- vscode-styled-components

## 터미널 선택
- Ctrl + Shift + p
- terminal : select Default Profile 선택
- gitBash 선택

## 폴더 구조
- components
- pages
- constants
- styles
- hooks
- configs
- utils
- atoms
- assets > 외부에서 불러올만한 파일 짤, 사진 등
- apis(services)
- store

## 주요 Hook 함수
- useState(기본값)
- useEffect(() => {}, []) 함수, 중속성
- useRef(기본값)
- useMamo(() => 리턴, [])
- useCallback(() => {}, [])
- useRecoilState(atom)
- useNavigate()
- useLocation()
- useParams()
- useSearchParams()

## 명명규칙
- Component 이름은 대문자로 시작
- 하나의 Component 폴더에는 하나의 Component.jsx 파일, style.js 파일로 구성
- constants 폴더에 들어가는 상수들은 대문자와 스네이크 표기법으로 작성
- 이벤트 함수명은 handle 로 시작해서 이벤트명으로 끝낸다