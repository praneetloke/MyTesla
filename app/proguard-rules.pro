# Add project specific ProGuard rules here.
# By default, the flags in this file are appended to flags specified
# in /Android/tools/proguard/proguard-android.txt
# You can edit the include path and order by changing the proguardFiles
# directive in build.gradle.
#
# For more details, see
#   http://developer.android.com/guide/developing/tools/proguard.html

# Add any project specific keep options here:

# If your project uses WebView with JS, uncomment the following
# and specify the fully qualified class name to the JavaScript interface
# class:
#-keepclassmembers class fqcn.of.javascript.interface.for.webview {
#   public *;
#}

-dontusemixedcaseclassnames
-dontskipnonpubliclibraryclassmembers

-keepattributes Signature,RuntimeVisibleAnnotations,AnnotationDefault
-keepattributes *Annotation*,EnclosingMethod

#Uncomment below line while debugging release APK
#-keepattributes SourceFile,LineNumberTable

-keep public class * extends android.app.Activity
-keep public class * extends android.app.Application
-keep public class * extends android.app.TabActivity
-keep public class * extends android.app.Application
-keep public class * extends android.app.Service
-keep public class * extends android.content.BroadcastReceiver
-keep public class * extends android.content.ContentProvider
-keep public class * extends android.os.AsyncTask

-keep public class com.myappfactory.tesla.models.* {
	void set*(***);
	*** get*();
}

-keep public class com.myappfactory.tesla.clients.*

-keep public class org.springframework.*

-keep class android.support.v4.app.** { *; }
-keep interface android.support.v4.app.** { *; }

-keepnames class org.springframework.** { *; }

-dontwarn javax.xml.**
-dontwarn javax.xml.stream.events.**
-dontwarn org.springframework.**

#Android support v4 -dontwarn
-dontwarn android.support.v4.media.**
-dontwarn android.support.v4.view.accessibility.**
-dontwarn android.support.v4.accessibilityservice.**
-dontwarn android.support.v4.hardware.**
-dontwarn android.support.v4.view.GravityCompatJellybeanMr1
-dontwarn android.support.v4.view.MarginLayoutParamsCompatJellybeanMr1
-dontwarn android.support.v4.view.ViewCompatJellybeanMr1
