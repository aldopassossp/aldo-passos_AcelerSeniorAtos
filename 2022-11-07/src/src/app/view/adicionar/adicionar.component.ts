import { ServicePessoaService } from './../../service/service-pessoa.service';
import { Component, OnInit } from '@angular/core';
import { UntypedFormBuilder, UntypedFormGroup } from '@angular/forms';

@Component({
  selector: 'app-adicionar',
  templateUrl: './adicionar.component.html',
  styleUrls: ['./adicionar.component.css']
})
export class AdicionarComponent implements OnInit {

  form: UntypedFormGroup;
  constructor(private formBuilder: UntypedFormBuilder, private service: ServicePessoaService) {

    this.form = this.formBuilder.group({
      nome: [null],
      idade: [null],
      profissao: [null]
    });
   }

  ngOnInit(): void {
  }

  onSubmit(){
    this.service.salvar(this.form.value).subscribe(result => console.log(result));
  }

  onCancel(){

  }
}
