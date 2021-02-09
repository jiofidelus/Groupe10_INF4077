import { Component, OnInit } from '@angular/core';
import { NgForm } from '@angular/forms';
import {Router} from '@angular/router';
import { PatientsService } from '../patients.service';
@Component({
  selector: 'app-icons',
  templateUrl: './icons.component.html',
  styleUrls: ['./icons.component.css']
})
export class IconsComponent implements OnInit {

  constructor(private apiservice:PatientsService) { }

  ngOnInit() {
  }

  onregister(userdata){
  
    userdata['role']="patient";
    userdata['etat']="saint";
    console.log(userdata);
    this.apiservice.Registeruser(userdata)
        .subscribe(resp=>{
          alert("enregistrement terminer");
         //this.router.navigateByUrl('/login');
        },error => {
          //this.result=1;
        });


  }
   onFormSubmit(userForm:NgForm){
     console.log(userForm);
   }
   resetUserForm(userForm:NgForm){
     userForm.resetForm();
   }
}
