import { Component, OnInit } from '@angular/core';

@Component({
  selector: 'app-data-binding',
  templateUrl: './data-binding.component.html',
  styleUrl: './data-binding.component.css'
})
export class DataBindingComponent implements OnInit{

  url: string = 'http://loiane.com';
  imagemUrl = 'https://picsum.photos/200/300';

  getValor(){
    return 1;
  }

  cursoAngular: boolean = true;

  getCurtirCurso(){
    return true;
  }

  constructor(){}

  ngOnInit(): void {

  }
}
