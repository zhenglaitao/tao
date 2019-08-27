**slf4j MDC**
<br>
`为每个请求生成requestId,异步任务重写，复用requestId`
<br>
`重写线程池-采用Alibaba开源的jar`
* [参考链接](https://blog.csdn.net/zlt2000/article/details/99641821)


**todo**
<br>
`requestId存储到DB，这样可以根据每个请求的id查询log`