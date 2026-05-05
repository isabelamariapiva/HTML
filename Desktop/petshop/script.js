async function deletarCategoria(id) {
  try {
    console.log("Tentando deletar ID:", id);

    const res = await fetch(`http://localhost:8080/categoria/${id}`, {
      method: "DELETE"
    });

    console.log("Status DELETE:", res.status);

    carregarCategorias(); // atualiza a lista

  } catch (erro) {
    console.error("Erro ao deletar categoria:", erro);
  }
}