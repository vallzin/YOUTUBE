import { Component, OnInit } from '@angular/core';
import { AppCursosService } from '../cursos/app-cursos.service';

@Component({
  selector: 'app-app-cursos',
  templateUrl: './app-cursos.component.html',
  styleUrls: ['./app-cursos.component.css']
})
export class AppCursosComponent implements OnInit{

  nomePortal: string;

  cursos: string[];

  constructor(private cursosService: AppCursosService){
    this.nomePortal = 'http://loiane.training';
    //var servico = new AppCursosService();
    this.cursos = this.cursosService.getCursos();
  }


  ngOnInit(): void { }
}
