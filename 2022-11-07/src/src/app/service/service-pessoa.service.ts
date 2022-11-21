import { HttpClient } from '@angular/common/http';
import { Injectable } from '@angular/core';
import { ModelPessoa } from '../model/model-pessoa';

@Injectable({
  providedIn: 'root'
})
export class ServicePessoaService {

  constructor(private httpclient: HttpClient) { }
  private readonly url = 'http://localhost:8080/api/pessoa/pessoas';
  listarPessoa(){
    return this.httpclient.get<ModelPessoa[]>(this.url);
  }

  salvar(registro: ModelPessoa){
    return this.httpclient.post<ModelPessoa[]>('http://localhost:8080/api/pessoa/cadastrar',registro);
  }
}
