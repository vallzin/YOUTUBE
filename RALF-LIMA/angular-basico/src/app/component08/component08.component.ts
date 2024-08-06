import { Component } from '@angular/core';

@Component({
  selector: 'app-component08',
  standalone: true,
  imports: [],
  templateUrl: './component08.component.html',
  styleUrl: './component08.component.css'
})
export class Component08Component {

  media:number = 8;

  nomes:string[] = ['Ralf', 'Ana', 'Danilo', 'Camila'];

  linguagem:string = 'PHP';

}
