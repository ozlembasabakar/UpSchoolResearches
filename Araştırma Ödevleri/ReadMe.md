# Araştırma Ödevleri:

- [Araştırma Projesi 1 - Lateinit](https://github.com/ozlembasabakar/UpSchoolAndroidDevelopmentBootcamp/blob/main/Ara%C5%9Ft%C4%B1rma%20%C3%96devleri/lateinit.docx)
- [Araştırma Projesi 2 - Tools Namespace](https://github.com/ozlembasabakar/UpSchoolAndroidDevelopmentBootcamp/blob/main/Ara%C5%9Ft%C4%B1rma%20%C3%96devleri/tools%20namespaces.docx)

### <a name="1"></a> Araştırma Projesi 1

- Lateinit neden kullanıyoruz?
- Lateinit kullanımından bahseder misiniz?
- Lateinit için bir örnek kullanım gösterir misiniz ?

### <a name="1"></a> Cevap 1


***lateinit*** kulanıldığında, değer atamasını ilk aşamada yapmasakta değişkeni tanımlayabiliyoruz. Böylelikle Null-safe’de yapmış oluyoruz. Ancak sadece ***var*** olan değişenlerde kullanılabiliyor. Bunun sebebi ise Bytecode seviyesinde final olarak tanımlanmaması gerekiyor, çünkü tanımlaması sonra yapılıyor. Kotlinde final şeklinde tanımlayıp, değerini sonradan değiştirebiliyor olsaydık, Java kısmında sorunlar oluşabilirdi. Çünkü Java bunu final olarak görüp ve değiştiremeyecekti. Bu sebepten dolayı lateinit, her daim final olmayan değişkenlerde kullanılabilir şekilde yapılmış.


```
class MainActivity : AppCompatActivity() {

lateinit var buttonClick: Button

override fun onCreate(savedInstanceState: Bundle?) {
super.onCreate(savedInstanceState)
setContentView(R.layout.activity_main)

buttonClick = findViewById<Button>(R.id.button)
buttonClick.setOnClickListener {
val intent = Intent(this, StartActivity::class.java)
startActivity(intent)
        }
    }
}
```


### <a name="2"></a> Araştırma Projesi 2


- Layout dizini içinde xml dosyalarımız için kullandığımız namespace nedir ?
- Neden kullanılmaktadır ?
- Nasıl kullanılmalıdır ?
- Bir adet Tools (tools namespace) attribute kullanımını gösterir misiniz ? 

### <a name="2"></a> Cevap 2

Android Studio, tools namespace alanında design-time(bir layout dosyasında hangi düzenin gösterileceği gibi) veya compile-time (XML kaynaklarınıza hangi küçültme modunun uygulanacağı gibi) özelliklerini etkinleştiren çeşitli XML özelliklerini destekler. Uygulama oluşturulduğunda, derleme araçları bu öznitelikleri kaldırır, böylece APK boyutu veya runtime davranışı üzerinde hiçbir etkisi olmaz.

Koyu renkle gösterilen kısımda activity dosyamısın adı ne ise onu yazmalıyız. 
```
<?xml version="1.0" encoding="utf-8"?>
<androidx.constraintlayout.widget.ConstraintLayout xmlns:android="http://schemas.android.com/apk/res/android"
      xmlns:app="http://schemas.android.com/apk/res-auto"
      xmlns:tools="http://schemas.android.com/tools"
      android:layout_width="match_parent"
      android:layout_height="match_parent"
      tools:context=".MainActivity">

</androidx.constraintlayout.widget.ConstraintLayout>
```

## <a name="3"></a> Araştırma Projesi 3

- Font family dosyası nasıl oluşturulup kullanıyoruz?
- Neden belirttiğiniz şekilde kullanımı tercih ediyoruz?

### <a name="3"></a> Cevap 3

Öncelikle res içine bir font dizini oluşturulur. *Resource type* olarak font seçilmelidir. Varolan fontlar bu dizin içine kaydedilebilir. Eğer yeni font oluşturulmak istenirse, font dizinine sağ tıklanıp **New > Font resource file** yolu izlenerek yeni font xml dosyası oluşturulabilir. 

Oluşturulan xml dosyası içinde font taglarının içerisine istenilen özelliklerde fontlar oluşturularak kullanılabilir. ```android:font="@font/……"```  bu kısımda ise daha sonra kullanmak için fonta isim verilebilir. ```android:fontWeight=""``` değerini arttırarak bold fontlarda oluşturulabilir.

Oluşturulan fontlar;
- layout xml’i içindeki TextView’da ```android:fontFamily="@font/fontName"``` şeklinde
- style.xml içinde ```<item name="android:fontFamily">@font/fontName</item>``` seklinde çağırılabilir. 
 
Oluşturulan fontu programatik olarak kullanmı
```
val typeface = resources.getFont(R.font.myfont)
textView.typeface = typeface
```
şeklindedir. TextView içerisinde kullanmak daha kolay ve daha temiz bir kullanım sağlamaktadır. 
 ```
<?xml version="1.0" encoding="utf-8"?>
<font-family xmlns:android="http://schemas.android.com/apk/res/android">
    <font
        android:fontStyle="normal"
        android:fontWeight="400"
        android:font="@font/lobster_regular" />
    <font
        android:fontStyle="italic"
        android:fontWeight="400"
        android:font="@font/lobster_italic" />
</font-family>
```
