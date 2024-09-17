import { Component, OnInit } from '@angular/core';

@Component({
  selector: 'app-diretiva-ngfor',
  templateUrl: './diretiva-ngfor.component.html',
  styleUrl: './diretiva-ngfor.component.css'
})
export class DiretivaNgforComponent implements OnInit{

  cursos: string[]=['Angular','java', 'php'];

  constructor(){
  }
  ngOnInit(): void {
    for(let i = 0; i < this.cursos.length; i++){
      let curso = this.cursos[i];
    }
  }
}
