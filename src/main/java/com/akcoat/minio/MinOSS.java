//package com.akcoat.minio;
//
//import io.minio.*;
//import io.minio.errors.*;
//import io.minio.http.Method;
//
//import java.io.IOException;
//import java.security.InvalidKeyException;
//import java.security.NoSuchAlgorithmException;
//import java.util.concurrent.TimeUnit;
//
//public class MinOSS {
//
//    public static String getObjectUrl(String bucketName, String objectName,MinioClient minioClient) throws ServerException, InsufficientDataException, ErrorResponseException, IOException, NoSuchAlgorithmException, InvalidKeyException, InvalidResponseException, XmlParserException, InternalException {
//       String url = minioClient.getPresignedObjectUrl(
//                GetPresignedObjectUrlArgs.builder()
//                        .method(Method.GET)
//                        .bucket(bucketName)
//                        .object(objectName)
//                        .build());
//        return url;
//
//    }
//
//
//    public static void main(String[] args) {
//        MinioClient minioClient = MinioClient.builder().endpoint("42.192.135.4", 9001, false).credentials("root", "wJalrXUtnFEMI/K7MDENG/bPxRfAMPLEKEY").build();
//        try {
//            // 使用MinIO服务的URL，端口，Access key和Secret key创建一个MinioClient对象
//            // 检查存储桶是否已经存在
//            boolean isExist = minioClient.bucketExists(BucketExistsArgs.builder().bucket("akcoat").build());
//            if(isExist) {
//                System.out.println("Bucket already exists.");
//            } else {
//                // 创建一个名为asiatrip的存储桶，用于存储照片的zip文件。
//                minioClient.makeBucket(MakeBucketArgs.builder().bucket("akcoat").build());
//            }
//
//            // 使用putObject上传一个文件到存储桶中。
//            // uploadObject  是一个异步操作;
//            // 数据入库时需要考虑 objName 如何命名的问题
//            //ObjectWriteResponse objectWriteResponse = minioClient.uploadObject(UploadObjectArgs.builder().bucket("akcoat").filename("C:\\普天铁心壁纸.jpg").object("pic").build());
//            String objectUrl = getObjectUrl("akcoat", "pic", minioClient);
//            System.out.println(objectUrl);
//            System.out.println("/home/user/Photos/asiaphotos.zip is successfully uploaded as asiaphotos.zip to `asiatrip` bucket.");
//
//        } catch(MinioException e) {
//            System.out.println("Error occurred: " + e);
//        } catch (IOException e) {
//            throw new RuntimeException(e);
//        } catch (NoSuchAlgorithmException e) {
//            throw new RuntimeException(e);
//        } catch (InvalidKeyException e) {
//            throw new RuntimeException(e);
//        }
//    }
//}
//
