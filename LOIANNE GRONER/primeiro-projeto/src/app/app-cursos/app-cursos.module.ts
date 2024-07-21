import { NgModule } from '@angular/core';
import { CommonModule } from '@angular/common';

import { AppCursosComponent } from './app-cursos.component';
import { AppCursosCursoDetalheComponent } from './app-cursos-curso-detalhe/app-cursos-curso-detalhe.component';
import { AppCursosService } from '../cursos/app-cursos.service';



@NgModule({
  declarations: [
    AppCursosComponent,
    AppCursosCursoDetalheComponent
  ],
  imports: [
    CommonModule,
  ],
  exports: [
    AppCursosComponent,
  ],
  providers: [
    AppCursosService
  ]
})
export class AppCursosModule { }
