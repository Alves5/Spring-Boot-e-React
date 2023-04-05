function Formulario({botao, eventoTeclado, cadastrar, obj, cancelar, remover, alterar}){
    return(
        <form action=''>
            <input type='text' value={obj.nome} onChange={eventoTeclado} name='nome' placeholder='Nome' className='form-control'/>
            <input type='text' value={obj.marca} onChange={eventoTeclado} name='marca' placeholder='Marca' className='form-control'/>

            {
                botao
                    ?
                     <input type= 'button' value='Cadastrar' onClick={cadastrar} className='btn btn-primary'/>
                    :
                    <div>
                        <input onClick={alterar} type='button' value='Alterar' className='btn btn-warning'/>
                        <input onClick={remover} type='button' value='Remover' className='btn btn-danger'/>
                        <input onClick={cancelar} type='button' value='Cancelar' className='btn btn-secondary'/>
                    </div>
            }
        </form>
    )
}
export default Formulario;