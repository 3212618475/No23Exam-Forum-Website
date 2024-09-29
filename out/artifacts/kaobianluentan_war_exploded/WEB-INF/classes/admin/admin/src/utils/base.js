const base = {
    get() {
        return {
            url : "http://localhost:8080/kaobianluentan/",
            name: "kaobianluentan",
            // 退出到首页链接
            indexUrl: 'http://localhost:8080/kaobianluentan/front/index.html'
        };
    },
    getProjectName(){
        return {
            projectName: "考编论坛网站"
        } 
    }
}
export default base
