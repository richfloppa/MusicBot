����   7�
 P � �
 � � � � � �
  � � �
  � � �
 � �
 � �
 � �
 ' �
 
 �
 
 �
 
 �	 
 �   � � � �
 P �
 � �
  �
  � �
  �
  �  � � �
  �
  �
  � �
 $ � � �
 ' �
 ' 


 
 	

 
 
  	 �
 �
 
 !	"#$%
&'
 (
 )
 *+,-
 .
 �/
0124
 U �
 U79
 X �
 X:;
 X<
 X=
3>?@
 �A
 �BCD
 c �
 bEF
 bG
 � �
 � �HIJKLM	NO
PQRJSTUV sWLX Z[
 \ NEW_VERSION_AVAILABLE Ljava/lang/String; ConstantValue WINDOWS_INVALID_PATH <init> ()V Code LineNumberTable LocalVariableTable this 'Lcom/jagrosh/jmusicbot/utils/OtherUtil; getPath ((Ljava/lang/String;)Ljava/nio/file/Path; path result Ljava/nio/file/Path; StackMapTable] loadResource 8(Ljava/lang/Object;Ljava/lang/String;)Ljava/lang/String; sb Ljava/lang/StringBuilder; reader Ljava/io/BufferedReader; ignored Ljava/io/IOException; clazz Ljava/lang/Object; name imageFromUrl )(Ljava/lang/String;)Ljava/io/InputStream; u Ljava/net/URL; urlConnection Ljava/net/URLConnection; url^ 	parseGame ;(Ljava/lang/String;)Lnet/dv8tion/jda/api/entities/Activity; parts [Ljava/lang/String; game lower makeNonEmpty &(Ljava/lang/String;)Ljava/lang/String; str parseStatus 6(Ljava/lang/String;)Lnet/dv8tion/jda/api/OnlineStatus; status st "Lnet/dv8tion/jda/api/OnlineStatus;_ checkJavaVersion *(Lcom/jagrosh/jmusicbot/entities/Prompt;)V prompt 'Lcom/jagrosh/jmusicbot/entities/Prompt; checkVersion version latestVersion getCurrentVersion ()Ljava/lang/String; getLatestVersion obj Lorg/json/JSONObject; Ljava/io/Reader; response Lokhttp3/Response; body Lokhttp3/ResponseBody; ex Ljava/lang/Exception;`ab getUnsupportedBotReason -(Lnet/dv8tion/jda/api/JDA;)Ljava/lang/String; jda Lnet/dv8tion/jda/api/JDA; info .Lnet/dv8tion/jda/api/entities/ApplicationInfo; lambda$loadResource$0 .(Ljava/lang/StringBuilder;Ljava/lang/String;)V line 
SourceFile OtherUtil.java } ~ java/lang/Stringcdefgh �i � %com/jagrosh/jmusicbot/utils/OtherUtil c:\windows\system32\jk java/io/File com/jagrosh/jmusicbot/JMusicBotlmnopqrstuv }wxy � �z z BootstrapMethods{|}~ java/net/URISyntaxException java/io/BufferedReader java/io/InputStreamReader�� � }� }� java/lang/StringBuilder������������ �� ~ java/lang/Throwable�� java/io/IOException java/net/URL }��� 
user-agent sMozilla/5.0 (Windows NT 10.0; Win64; x64) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/49.0.2623.112 Safari/537.36����� "java/lang/IllegalArgumentException�� default�k playing�� � ��
 � listening to � 	listening watching � 	streaming \s+���} �� ​� �� � java.vm.name�� � 64����� Java Version VIt appears that you may not be using a supported Java version. Please use 64-bit java.��� � � � ��� JMusicBot Version �There is a new version of JMusicBot available!
Current version: %s
New Version: %s

Please visit https://github.com/jagrosh/MusicBot/releases/latest to get the latest release. java/lang/Object������ � UNKNOWN� okhttp3/OkHttpClient$Builder Builder InnerClasses��� okhttp3/Request$Builderd� =https://api.github.com/repos/jagrosh/MusicBot/releases/latest ��������� ���� org/json/JSONObject org/json/JSONTokener }� tag_name� � org/json/JSONException java/lang/NullPointerException������������ HThe bot is verified. Using JMusicBot in a verified bot is not supported.����� ,net/dv8tion/jda/api/entities/ApplicationInfo��� ��}� 
�� java/nio/file/Path java/lang/Exception  net/dv8tion/jda/api/OnlineStatus okhttp3/Response okhttp3/ResponseBody java/io/Reader java/nio/file/Paths get ;(Ljava/lang/String;[Ljava/lang/String;)Ljava/nio/file/Path; toAbsolutePath ()Ljava/nio/file/Path; toString toLowerCase 
startsWith (Ljava/lang/String;)Z java/lang/Class getProtectionDomain "()Ljava/security/ProtectionDomain; java/security/ProtectionDomain getCodeSource ()Ljava/security/CodeSource; java/security/CodeSource getLocation ()Ljava/net/URL; toURI ()Ljava/net/URI; (Ljava/net/URI;)V getParentFile ()Ljava/io/File; 	separator
��  makeConcatWithConstants J(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String; getClass ()Ljava/lang/Class; getResourceAsStream (Ljava/io/InputStream;)V (Ljava/io/Reader;)V lines ()Ljava/util/stream/Stream;
�� (Ljava/lang/Object;)V
 � (Ljava/lang/String;)V accept 8(Ljava/lang/StringBuilder;)Ljava/util/function/Consumer; java/util/stream/Stream forEach  (Ljava/util/function/Consumer;)V trim close addSuppressed (Ljava/lang/Throwable;)V openConnection ()Ljava/net/URLConnection; java/net/URLConnection setRequestProperty '(Ljava/lang/String;Ljava/lang/String;)V getInputStream ()Ljava/io/InputStream; isEmpty ()Z equalsIgnoreCase 	substring (I)Ljava/lang/String; %net/dv8tion/jda/api/entities/Activity split ((Ljava/lang/String;I)[Ljava/lang/String; https://twitch.tv/ M(Ljava/lang/String;Ljava/lang/String;)Lnet/dv8tion/jda/api/entities/Activity; ONLINE fromKey java/lang/System getProperty contains (Ljava/lang/CharSequence;)Z +com/jagrosh/jmusicbot/entities/Prompt$Level Level WARNING -Lcom/jagrosh/jmusicbot/entities/Prompt$Level; %com/jagrosh/jmusicbot/entities/Prompt alert T(Lcom/jagrosh/jmusicbot/entities/Prompt$Level;Ljava/lang/String;Ljava/lang/String;)V equals (Ljava/lang/Object;)Z format 9(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String; 
getPackage ()Ljava/lang/Package; java/lang/Package getImplementationVersion okhttp3/OkHttpClient build ()Lokhttp3/OkHttpClient; okhttp3/Request ()Lokhttp3/Request$Builder; -(Ljava/lang/String;)Lokhttp3/Request$Builder; ()Lokhttp3/Request; newCall !(Lokhttp3/Request;)Lokhttp3/Call; okhttp3/Call execute ()Lokhttp3/Response; ()Lokhttp3/ResponseBody; 
charStream ()Ljava/io/Reader; (Lorg/json/JSONTokener;)V 	getString net/dv8tion/jda/api/JDA getSelfUser )()Lnet/dv8tion/jda/api/entities/SelfUser; %net/dv8tion/jda/api/entities/SelfUser getFlags ()Ljava/util/EnumSet;� *net/dv8tion/jda/api/entities/User$UserFlag UserFlag VERIFIED_BOT ,Lnet/dv8tion/jda/api/entities/User$UserFlag; java/util/EnumSet retrieveApplicationInfo +()Lnet/dv8tion/jda/api/requests/RestAction; 'net/dv8tion/jda/api/requests/RestAction complete ()Ljava/lang/Object; isBotPublic getId$"Public Bot" is enabled. Using JMusicBot as a public bot is not supported. Please disable it in the Developer Dashboard at https://discord.com/developers/applications//bot .You may also need to disable all Installation Contexts at https://discord.com/developers/applications//installation . 8(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String; append -(Ljava/lang/String;)Ljava/lang/StringBuilder;�}���� � � !net/dv8tion/jda/api/entities/User $java/lang/invoke/StringConcatFactory� Lookup �(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/invoke/CallSite; "java/lang/invoke/LambdaMetafactory metafactory �(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodHandle;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite;� %java/lang/invoke/MethodHandles$Lookup java/lang/invoke/MethodHandles !  P     y z  {    O  | z  {       } ~     /     *� �    �       ) �        � �   	 � �     �     Q*� � L+�  �  � � 	� 3� 
Y� � � � � � � � *�   � � L� M+�   K N   �       ; 	 =  A K C O E �       Q � z   	 H � �  �    � N   �    	 � �    '     S� Y� Y*� +� � � M� Y� N,� -�   �   -� !� ":,� #�N,� #� :-� %-�M�   7 > $ ? C F $   ; P & > P P &  �   & 	   Q  S  T . U 7 V ; U > Q P W Q Y �   4    � �   9 � �  Q  � �    S � �     S � z  �   < � >  P    $�   P   $  $�   P   & 	 � �     �     $*� �� 'Y*� (L+� )M,*+� ,,� -�L�     ! &    ! .  �   "    e  f  i  j  k  l ! n " o �        � �    � �    $ � z   �    Z � 	 � �    I     �*� *� "� /� *� "0� 1� �*� L+2� 	� *� 3� "� 4� 5�+6� 	� *� 3� "� 4� 7�+8� 	� *	� 3� "� 4� 7�+9� 	� *� 3� "� 4� :�+;� 	� +*	� 3� "<� =M,�� ,2� 4,2� >  � ?�*� 5�    �   B    z  {  | ! } * ~ :  C � S � \ � l � u � � � � � � � � � � � �      �  � �    � � z   ! � � z  �    �  0 	 � �     J     *� 
*� /� @� *�    �       � �        � z   �    @  	 � �     w     #*� *� "� /� � A�*� BL+� 	� A� +�    �       �  �  �  � �       # � z     � �  �    �  �@ � 	 � �     T     C� DE� F� *� GHI� J�    �       �  �  � �        � �   �     	 � �     �     /� KL� LM,� %,+� M� *� GNO� PY+SY,S� Q� J�    �       �  �  �  � . � �        / � �    + � z   ' � z  �    � .   	 � �     H      � R� � R� S� � R� S�T�    �       �  �  � �     	 � �    �     ~� UY� V� W� XY� Y� Z[� \� ]� ^� _ K*� `L+� N+� aM� bY� cY,� d� eN-f� g:,� ,� h*� i�N,� ,� h� :-� %-�:*� i��K� 
 3 K Z $ _ c f $ . S p   Z r p     W { &   W { j   W { k Z z { & Z z { j Z z { k  �   F    �  �  � % � * � . � 3 � C � K � S � W � Z � p � v � y � { � | � �   4  C  � �  3 = � �  % V � �   * Q � �  |  � �   �   ] � S  � � � b   �   � � �  $�   � � � $  $�   � �  $�     � 	 � �     �     M*� l � m � n� o� p�*� q � r � sL+� t � *� l � u *� l � u � v  ��    �   & 	   �  �  � & � / � 0 � ; � J � K � �       M � �   & ' � �  �   	 � 3 s
 � �     @     *w� x+� xW�    �       T �        � �      � z   �    �6   *  U35  X85 	"&�@N��@���  �     �  � �  � � � �  � Y