import { Injectable } from '@angular/core';

@Injectable()
export class AppCursosService {

  constructor() { }

  getCursos(){
    return ['Java', 'Ext JS', 'Angular'];
  }

}
