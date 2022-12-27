# 위치 검색 지도 앱

### 프로젝트 소개
위치 검색을 통해 마커로 지도에 위치를 표시하고, 현재 내 위치 정보를 가져와 마커로 지도 위에 표시하는 앱

![94AF7200-811B-4DF8-937C-BF28D9178E83-58326-000018679E758B95](https://user-images.githubusercontent.com/120105216/208840545-64cb762a-5b91-4e32-831b-3691148fc49a.jpg)

---

### 주요 기능
- poi기능을 통해 Retrofit으로 가져온 response 바디를 Gson으로 파싱해서 사용
- 검색화면에서 받아왔떤 데이터를 intent로 넘겨받아 GoogleMap을 통해 마커로 지도 위치 표현
- poi API를 통해 현재 내 위치 정보를 가져와 Gson으로 파싱해 데이터를 다시 한 번 마커를 통해 뿌려줌

---

### 사용 기술
- GoogleMap poi
- Coroutine
- Retrofit
- OkHttp
- ViewBinding
