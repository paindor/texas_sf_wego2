"use strict";
var auth = auth || {};
auth = (()=>{
    let _, js, auth_vue_js
    let init = ()=>{
        _ = $.ctx()
        js = $.js()
        auth_vue_js = js+'/vue/auth_vue.js'
    }
    let onCreate =()=>{
        init()
        $('#a_go_join').click(()=>{
        	$.getScript(auth_vue_js)
        	alert('회원가입 클릭!!')
        $('head')
        .html(auth_vue.join_head())
            $('body')
        .html(auth_vue.join_body())
            $('<button>',{
                text : 'Continue to checkout',
                href : '#',
                click : e=>{
                	e.preventDefault();
                	let data = {uid : $('#userid').val(), pwd : $('#password').val()}
                	alert('전송아이디: '+data.uid)
                    $.ajax({
                    	url : _+'/user/join',
                    	type : 'POST',
                    	dataType : 'json',
                    	data : JSON.stringify(data),
                    	contentType : 'application/json',
                    	success : d => {
                    		alert('AJAX 성공 아이디: '+d.uid+', 성공비번: '+d.pwd);
                    		
                    	},
                    	error : e => {
                    		alert('AJAX 실패');
                    	}
                    })
                }
            })
            .addClass('btn btn-primary btn-lg btn-block')
            .appendTo('#btn_join')
            
          
            
        });
    }
    return {onCreate : onCreate}
})();