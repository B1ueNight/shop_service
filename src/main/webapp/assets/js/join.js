$(function(){
    $("#join").click(function(){
        if(!checkEmail($("#mi_email").val())) {
            alert("올바른 형식의 이메일을 입력해주세요.");
            return;
        }
        if($("#mi_pwd").val().length < 6){
            alert("비밀번호는 6자 이상이어야 합니다.");
            return;
        }
        if(!checkWhitespace($("#mi_pwd").val())){
            alert("비밀번호에는 공백문자를 사용할 수 없습니다.")
            return;
        }
        if($("#mi_pwd").val() != $("#mi_pwd_confirm").val()){
            alert("비밀번호 확인이 일치하지 않습니다.");
            return;
        }
        if($("#mi_name").val().length < 2){
            alert("올바른 이름을 입력해주세요.");
            return;
        }
        if($("#mi_birth").val().length != 8){
            alert("생년월일은 8자로 입력해주세요.")
            return;
        }
        if(!checkWhitespace($("#mi_birth").val())){
            alert("생년월일은 공백을 포함할 수 없습니다.")
            return;
        }
        if(!($("#mi_phone").val().length == 10 || $("#mi_phone").val().length == 11)){
            alert("올바른 연락처를 입력해주세요.")
            return;
        }
        if(!checkWhitespace($("#mi_phone").val())){
            alert("연락처는 공백을 포함할 수 없습니다.")
            return;
        }
        let data ={
            mi_email:$("#mi_email").val(),
            mi_pwd:$("#mi_pwd").val(),
            mi_name:$("#mi_name").val(),
            mi_birth:$("#mi_birth").val(),
            mi_gen:$("#mi_gen").val(),
            mi_phone:$("#mi_phone").val(),
            mi_address:$("#mi_address").val()
        }

        console.log(JSON.stringify(data));
        $.ajax({
            url:"/member/join",
            type:"post",
            data:JSON.stringify(data),
            contentType:"application/json",
            success:function(r) {
                alert(r.message)
                if(r.status)
                    location.href="/";
            }
        })
    })

    function checkEmail(email){
        //true 이메일 형식에 맞음
        //false 형식에 맞지않음.
        let regex = /^[0-9a-zA-z]([-_.]?[0-9a-zA-Z])*@[0-9a-zA-Z]([-_.]?[0-9a-zA-Z])*.[a-zA-Z]{2,3}$/i;
        return email.match(regex) != null;
    }

    function checkWhitespace(text) {
        //true 이메일 형식에 맞음
        //false 형식에 맞지않음.
        let regex = /\s/g;
        return text.match(regex) == null;
        //null이 아닐경우 false, null이라면 true
    }
})
    
