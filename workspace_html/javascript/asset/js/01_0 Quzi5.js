window.onload = init;
function init() {

    // const copy = document.querySelector('#copy')
    bind()
}

function bind() {
    const copy = document.querySelector('#copy')
    const text = document.querySelector('#text')
    const ifa = document.querySelector('#ifa')
    text.addEventListener('keydown', function (event) { //엔터로 copy작동
        if (event.key === 'Enter') { //text에 엔터키가 나오면
            copy.click()//copy.click실행
        }
    })

    //전체선택
    let select = document.createElement('label')//input에는 이너HTML이 안되기때문에 부모역할
    let select1 = document.createElement('input')//체크박스생성용
    select1.type = 'checkbox'//
    select1.vlaue = '전체선택'//select에 HTML을 줄방법을 몰라서 복사용으로 만듬
    select.innerHTML = select1.vlaue

    select.append(select1)//select(label)의 자식으로 select1(input)을줌
    document.body.appendChild(select)//select를 body에 붙혀서 화면에 보이게

    //선택삭제              //html내용받기위한 라벨
    const sd1 = document.createElement('label')
    const sd = document.createElement('input')
    const sd2 = document.body.appendChild(sd1)
    sd.type = 'button'
    sd.value = '선택삭제'
    document.body.append(sd)         //br을js못주니까 하나 만들어서 바디에 붙히고 변수줌
    let br1 = document.body.appendChild(document.createElement('br'))
    sd1.append(sd)
    sd1.append(br1)//br을 sd1에 붙힘

    //전체선택          
    select1.addEventListener('change', function () {
        const check = document.querySelectorAll('.zzz')//클래스가 zzz인애들을 변수에담음
        //변수에 담긴것들만큼 반복 (이건전달인자 이름상관no)
        check.forEach(function (checkbox) {//배열을 하나하나 뽑아쓰기위한 전달인자
            if (select1.checked) { //select1이 체크되면 
                checkbox.checked = true//check를 체크
            } else if (!select1.checked) {
                checkbox.checked = false
            }
            // if(!check.checked){
            //     select1.checked=false
            // }
        })
    })

    //추가
    copy.addEventListener('click', function () {
        if (text.value == '') {//text에 암것도 없음
            ifa.innerHTML = "입력해주세용"//실행
            return;// 리턴값을 주지않아서 여기서 종료
        }           //없으면 빈칸을 만듬
        ifa.innerHTML = ''//if 실패해서 실행됐을때 입력해주세용 지울려고
        console.log(text.value)
        const text1 = document.createElement('input')//input생성
        text1.type = 'checkbox' //생성한 인풋에 타입주기
        text1.className = 'zzz' //생성된 애들을 한데 모으기위한 변수
        const label = document.createElement('label')//라벨생성
        label.append(text1)//라벨에 인풋 자식으로넣기
        label.append(text.value)//삭제를 하면 부모가 지워져야하는데 개별로 구별하기위해  
        let label1 = document.querySelectorAll('label')//배열로 관리

        document.body.appendChild(label)//라벨 바디에 붙히기

        const del = document.createElement('input')//삭제용 인풋생성
        del.type = 'button'
        del.value = '삭제'
        label.append(del)//라벨에 삭제 자식주기
        let br = document.body.appendChild(document.createElement('br'))
        label.append(br)// 삭제를 하니 br때문에 그칸이 비어보여서 자식으로 줘서 같이삭제
        text.value = ''//텍스트 초기화



        //개별선택으로 전체선택체크 //체크박스가 변화가 있을때만 반응하게change사용
        text1.addEventListener('change', function () {
            const check = document.querySelectorAll('.zzz')
            if (text1.checked === false) {//생성한 체크박스가 펄스면
                select1.checked = false//전체선택도 펄스
            }
            let flag = true//체크박스 상태를 정의하기위함
            for (let i = 0; i < check.length; i++) {
                if (check[i].checked === false) {
                    flag = false;//if가 동작하면 펄스 체크박스가 체크가 안된게 있다는 상태
                    break;//펄스가 발견되면 포문이 돌 이유가 없기에 멈춤
                }
            }//포문안에서 다 확인 했으니까 펄스가 있으면
            if (flag) {//이게 작동을 안함 트루면
                select1.checked = true//전체선택 체크
            }
        })

        //선택삭제 sd는 선택삭제 버튼
        sd.addEventListener('click', function () {
            if (text1.checked) {//생선된 체크박스가 체크되면
                del.parentNode.remove()//삭제버튼의 부모인 라벨 삭제
            }
        })

        // 삭제
        console.log(label1.length)
        del.addEventListener('click', function () {
            del.parentNode.remove()//삭제버튼이 클릭되면 삭제버튼의 부모 삭제
            // del.parentNode.style.display ="none"
        })

    })


}