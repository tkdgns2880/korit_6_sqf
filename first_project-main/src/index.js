import React from 'react';
import ReactDOM from 'react-dom/client';
import './index.css';
import App from './ch18/App';
import { BrowserRouter } from 'react-router-dom';
import { RecoilRoot } from 'recoil';


const root = ReactDOM.createRoot(document.getElementById('root'));
root.render(
    <RecoilRoot>
        <BrowserRouter>
        <App />
        </BrowserRouter>
    </RecoilRoot>
); 
// 브라우저라우터를 사용하기 위해서는 태그를 만들어줘야한다
// 자동완성 -> rsf, ffc
// 파일설치 명령어 npm i recoi,

// BrowserRouter, RecoilRoot 사용하기 위해서는 태그를 걸어줘야한다
// RecoilRoot 태그안에 BrowserRouter 태그를 넣어줘야한다