import { Component, OnInit } from '@angular/core';
import { ActivatedRoute, Router } from '@angular/router';
import { Tema } from '../model/Tema';
import { TemaService } from '../service/tema.service';

@Component({
  selector: 'app-put-tema',
  templateUrl: './put-tema.component.html',
  styleUrls: ['./put-tema.component.css']
})
export class PutTemaComponent implements OnInit {

  tema: Tema = new Tema()
  idTema: number;

  constructor(
    private temaService: TemaService,
    private router: Router,
    private route: ActivatedRoute
  ) { }

  ngOnInit() {
    window.scroll(0,0)

    let id: number= this.route.snapshot.params['id'];
    this.fidByIdTema(id);
  }
  fidByIdTema(id: number){
    this.temaService.getByIdTema(this.idTema).subscribe((resp: Tema)=>{
      this.tema = resp
    })
  }
  salvar(){
    this.temaService.putTema(this.tema).subscribe((resp: Tema) =>{
      this.tema = resp
      this.router.navigate(['/cadastro-tema'])
      alert('Tema atualizado com sucesso')
    })
  }
  btnSim(){
    this.temaService.deleteTema(this.tema.id).subscribe(() =>{
      this.router.navigate(['/cadastro-tema'])
      alert('Tema apagado com sucesso!')
    })
  }
  
  }
