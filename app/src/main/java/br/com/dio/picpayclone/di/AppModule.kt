package `picPayCloneMentoriaDIO-Android-master`.app.src.main.java.br.com.dio.picpayclone.di

import br.com.dio.picpayclone.ui.componente.ComponenteViewModel
import br.com.dio.picpayclone.ui.pagar.PagarViewModel
import br.com.dio.picpayclone.ui.home.HomeViewModel
import br.com.dio.picpayclone.ui.ajuste.AjusteViewModel
import org.koin.androidx.viewmodel.dsl.viewModel
import org.koin.dsl.module

val viewModelModule = module {
    viewModel { HomeViewModel () }
    viewModel { PagarViewModel () }
    viewModel { AjusteViewModel () }
    viewModel { ComponenteViewModel () }
}

