FROM  frolvlad/alpine-oraclejre8:slim
VOLUME /home/logs/
#ENV gcLog=/gc/eurekaGc/eurekaGC.log
ARG JAR_FILE
ENV DEVICE_POSITION=0 MAXSIZE=512 MINSIZE=512
ADD ${JAR_FILE} app.jar
#RUN ln -sf /usr/share/zoneinfo/Asia/Shanghai /etc/localtime && echo 'Asia/Shanghai' > /etc/timezone

#RUN bash -c 'touch /app.jar'
#ENTRYPOINT ["java","-Djava.security.egd=file:/dev/./urandom","-Ddevice.position=${DEVICE_POSITION}","-Xmx${MAXSIZE}m","-Xms${MINSIZE}m","-jar","/app.jar"]
ENTRYPOINT java -Xmx${MAXSIZE}m -Xms${MINSIZE}m -Djava.security.egd=file:/dev/./urandom -Ddevice.position=${DEVICE_POSITION}  -jar /app.jar
EXPOSE 8085