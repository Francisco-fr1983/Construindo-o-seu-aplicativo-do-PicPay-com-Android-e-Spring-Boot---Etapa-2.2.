package br.com.dio.picpayclone

import android.os.Bundle
import android.view.View.GONE
import android.view.View.VISIBLE
import com.google.android.material.bottomnavigation.BottomNavigationView
import androidx.appcompat.app.AppCompatActivity
import androidx.navigation.findNavController
import androidx.navigation.ui.AppBarConfiguration
import androidx.navigation.ui.setupActionBarWithNavController
import androidx.navigation.ui.setupWithNavController
import br.com.dio.picpayclone.ui.componente.ComponenteViewModel
import org.koin.androidx.viewmodel.ext.android.viewModel

class MainActivity : AppCompatActivity() {

    private val componenteViewModel: ComponenteViewModel by viewModel()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val navView: BottomNavigationView = findViewById(R.id.nav_view)
        val navController = findNavController(R.id.nav_host_fragment)
        componenteViewModel.componentes.observe(this, observer {
            it?.let { temComponentes ->
                it(temComponentes.bottomNavigation) {
                    navView.visibility = VISIBLE
                } else {
                    navView.visibility = GONE
            }
            }

        })
        navView.setupWithNavController(navController)
    }
}