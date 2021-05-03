
import `picPayCloneMentoriaDIO-Android-master`.app.src.main.java.br.com.dio.picpayclone.di.viewModelModule
import android.app.Application


class AppApplication: Application {

    override fun onCreate() {
        super.onCreate()
        startkion {
            androidContext(this@AppApplication)
            modules(viewModelModule)
        }
    }
}